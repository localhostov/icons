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

public val Icons.Filled.Operation: ImageVector
    get() {
        if (_operation != null) {
            return _operation!!
        }
        _operation = Builder(name = "Operation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 12.0f)
                lineTo(0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.982f, 0.0f, 5.821f, 1.117f, 8.0f, 3.066f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.116f)
                curveToRelative(-1.865f, -1.893f, -4.417f, -3.0f, -7.116f, -3.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-2.699f, 0.0f, -5.252f, -1.107f, -7.117f, -3.0f)
                horizontalLineToRelative(4.117f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.066f)
                curveToRelative(2.179f, 1.949f, 5.018f, 3.066f, 8.0f, 3.066f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.698f, 9.872f)
                lineToRelative(-1.416f, 0.816f)
                curveToRelative(0.129f, 0.418f, 0.218f, 0.853f, 0.218f, 1.312f)
                reflectiveCurveToRelative(-0.089f, 0.894f, -0.218f, 1.312f)
                lineToRelative(1.416f, 0.816f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(-1.411f, -0.813f)
                curveToRelative(-0.605f, 0.652f, -1.393f, 1.125f, -2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(-0.896f, -0.205f, -1.684f, -0.678f, -2.289f, -1.33f)
                lineToRelative(-1.411f, 0.813f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(1.416f, -0.816f)
                curveToRelative(-0.129f, -0.418f, -0.218f, -0.853f, -0.218f, -1.313f)
                reflectiveCurveToRelative(0.089f, -0.895f, 0.218f, -1.312f)
                lineToRelative(-1.416f, -0.815f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(1.411f, 0.812f)
                curveToRelative(0.605f, -0.652f, 1.393f, -1.125f, 2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(0.896f, 0.205f, 1.685f, 0.678f, 2.289f, 1.33f)
                lineToRelative(1.411f, -0.813f)
                lineToRelative(0.998f, 1.733f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _operation!!
    }

private var _operation: ImageVector? = null
