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

public val Icons.Outline.Method: ImageVector
    get() {
        if (_method != null) {
            return _method!!
        }
        _method = Builder(name = "Method", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.414f, 17.0f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-3.5f, -3.5f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(19.414f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(-3.5f, -3.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(4.586f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 14.0f)
                horizontalLineToRelative(10.586f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.586f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(16.586f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(22.5f, 6.0f)
                curveToRelative(0.0f, -0.46f, -0.089f, -0.895f, -0.218f, -1.312f)
                lineToRelative(1.417f, -0.816f)
                lineToRelative(-0.999f, -1.732f)
                lineToRelative(-1.41f, 0.813f)
                curveToRelative(-0.605f, -0.652f, -1.393f, -1.126f, -2.289f, -1.331f)
                lineTo(19.001f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(-0.896f, 0.205f, -1.685f, 0.678f, -2.289f, 1.331f)
                lineToRelative(-1.41f, -0.813f)
                lineToRelative(-0.999f, 1.732f)
                lineToRelative(1.417f, 0.816f)
                curveToRelative(-0.129f, 0.418f, -0.218f, 0.853f, -0.218f, 1.312f)
                reflectiveCurveToRelative(0.089f, 0.895f, 0.218f, 1.312f)
                lineToRelative(-1.417f, 0.816f)
                lineToRelative(0.999f, 1.732f)
                lineToRelative(1.41f, -0.813f)
                curveToRelative(0.605f, 0.652f, 1.393f, 1.126f, 2.289f, 1.331f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(0.896f, -0.205f, 1.685f, -0.678f, 2.289f, -1.331f)
                lineToRelative(1.41f, 0.813f)
                lineToRelative(0.999f, -1.732f)
                lineToRelative(-1.417f, -0.816f)
                curveToRelative(0.129f, -0.418f, 0.218f, -0.853f, 0.218f, -1.312f)
                close()
                moveTo(18.0f, 8.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _method!!
    }

private var _method: ImageVector? = null
