package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(24.0f, 20.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.187f, 0.0f, 0.368f, 0.024f, 0.544f, 0.064f)
                curveToRelative(0.179f, -1.008f, 0.957f, -1.81f, 1.956f, -2.013f)
                verticalLineToRelative(-7.111f)
                lineTo(4.257f, 2.669f)
                lineToRelative(1.486f, -1.338f)
                lineToRelative(4.202f, 4.669f)
                horizontalLineToRelative(4.109f)
                lineToRelative(4.202f, -4.669f)
                lineToRelative(1.486f, 1.338f)
                lineToRelative(-4.743f, 5.27f)
                verticalLineToRelative(7.111f)
                curveToRelative(1.14f, 0.232f, 2.0f, 1.242f, 2.0f, 2.449f)
                verticalLineToRelative(0.551f)
                curveToRelative(0.162f, -0.033f, 0.329f, -0.051f, 0.5f, -0.051f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(2.5f, 19.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _podiumVictoryLeader!!
    }

private var _podiumVictoryLeader: ImageVector? = null
