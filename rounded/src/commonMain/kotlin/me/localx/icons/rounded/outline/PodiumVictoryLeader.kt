package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.PodiumVictoryLeader: ImageVector
    get() {
        if (_podiumVictoryLeader != null) {
            return _podiumVictoryLeader!!
        }
        _podiumVictoryLeader = Builder(name = "PodiumVictoryLeader", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.395f, 0.0f, 0.77f, 0.081f, 1.116f, 0.22f)
                curveToRelative(0.258f, -0.95f, 0.965f, -1.708f, 1.884f, -2.036f)
                verticalLineToRelative(-7.338f)
                lineTo(4.257f, 2.669f)
                curveToRelative(-0.37f, -0.411f, -0.336f, -1.043f, 0.074f, -1.412f)
                reflectiveCurveToRelative(1.043f, -0.336f, 1.412f, 0.074f)
                lineToRelative(4.202f, 4.669f)
                horizontalLineToRelative(4.109f)
                lineToRelative(4.202f, -4.669f)
                curveToRelative(0.37f, -0.41f, 1.002f, -0.444f, 1.412f, -0.074f)
                curveToRelative(0.41f, 0.369f, 0.443f, 1.001f, 0.074f, 1.412f)
                lineToRelative(-4.743f, 5.177f)
                verticalLineToRelative(7.339f)
                curveToRelative(1.161f, 0.414f, 2.0f, 1.514f, 2.0f, 2.816f)
                verticalLineToRelative(0.184f)
                curveToRelative(0.314f, -0.112f, 0.648f, -0.184f, 1.0f, -0.184f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(2.5f, 22.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _podiumVictoryLeader!!
    }

private var _podiumVictoryLeader: ImageVector? = null
