package me.localx.icons.straight.filled

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

public val Icons.Filled.Method: ImageVector
    get() {
        if (_method != null) {
            return _method!!
        }
        _method = Builder(name = "Method", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(0.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(20.0f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.0f, 19.0f)
                close()
                moveTo(16.5f, 14.5f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(2.5f, -2.5f)
                close()
                moveTo(22.282f, 7.312f)
                lineToRelative(1.417f, 0.816f)
                lineToRelative(-0.999f, 1.732f)
                lineToRelative(-1.41f, -0.813f)
                curveToRelative(-0.605f, 0.652f, -1.393f, 1.126f, -2.289f, 1.331f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(-0.896f, -0.205f, -1.685f, -0.678f, -2.289f, -1.331f)
                lineToRelative(-1.41f, 0.813f)
                lineToRelative(-0.999f, -1.732f)
                lineToRelative(1.417f, -0.816f)
                curveToRelative(-0.129f, -0.418f, -0.218f, -0.853f, -0.218f, -1.312f)
                reflectiveCurveToRelative(0.089f, -0.895f, 0.218f, -1.312f)
                lineToRelative(-1.417f, -0.816f)
                lineToRelative(0.999f, -1.732f)
                lineToRelative(1.41f, 0.813f)
                curveToRelative(0.605f, -0.652f, 1.393f, -1.126f, 2.289f, -1.331f)
                lineTo(17.001f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(0.896f, 0.205f, 1.685f, 0.678f, 2.289f, 1.331f)
                lineToRelative(1.41f, -0.813f)
                lineToRelative(0.999f, 1.732f)
                lineToRelative(-1.417f, 0.816f)
                curveToRelative(0.129f, 0.418f, 0.218f, 0.853f, 0.218f, 1.312f)
                reflectiveCurveToRelative(-0.089f, 0.895f, -0.218f, 1.312f)
                close()
                moveTo(19.5f, 6.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _method!!
    }

private var _method: ImageVector? = null
