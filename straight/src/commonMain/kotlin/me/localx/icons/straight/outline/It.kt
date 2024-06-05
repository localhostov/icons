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

public val Icons.Outline.It: ImageVector
    get() {
        if (_it != null) {
            return _it!!
        }
        _it = Builder(name = "It", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(6.303f, 8.129f)
                lineToRelative(1.416f, -0.816f)
                curveToRelative(-0.129f, -0.418f, -0.218f, -0.853f, -0.218f, -1.313f)
                reflectiveCurveToRelative(0.09f, -0.895f, 0.218f, -1.313f)
                lineToRelative(-1.416f, -0.816f)
                lineToRelative(0.998f, -1.732f)
                lineToRelative(1.41f, 0.812f)
                curveToRelative(0.605f, -0.652f, 1.393f, -1.125f, 2.289f, -1.33f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(0.896f, 0.205f, 1.685f, 0.679f, 2.29f, 1.331f)
                lineToRelative(1.411f, -0.813f)
                lineToRelative(0.998f, 1.732f)
                lineToRelative(-1.416f, 0.816f)
                curveToRelative(0.129f, 0.418f, 0.218f, 0.853f, 0.218f, 1.313f)
                reflectiveCurveToRelative(-0.089f, 0.895f, -0.218f, 1.313f)
                lineToRelative(1.416f, 0.816f)
                lineToRelative(-0.998f, 1.732f)
                lineToRelative(-1.411f, -0.813f)
                curveToRelative(-0.605f, 0.652f, -1.393f, 1.126f, -2.29f, 1.331f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(-0.896f, -0.205f, -1.685f, -0.678f, -2.289f, -1.33f)
                lineToRelative(-1.41f, 0.812f)
                lineToRelative(-0.998f, -1.732f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _it!!
    }

private var _it: ImageVector? = null
