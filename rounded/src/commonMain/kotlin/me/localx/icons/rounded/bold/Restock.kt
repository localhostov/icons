package me.localx.icons.rounded.bold

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

public val Icons.Bold.Restock: ImageVector
    get() {
        if (_restock != null) {
            return _restock!!
        }
        _restock = Builder(name = "Restock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.513f, 13.0f)
                curveToRelative(-0.828f, -0.038f, -1.538f, -0.742f, -1.5f, -1.57f)
                curveTo(0.313f, 5.021f, 5.579f, 0.0f, 12.0f, 0.0f)
                curveToRelative(2.485f, 0.0f, 4.883f, 0.775f, 6.894f, 2.189f)
                lineToRelative(1.393f, -1.393f)
                curveToRelative(0.632f, -0.632f, 1.713f, -0.184f, 1.713f, 0.71f)
                verticalLineToRelative(4.491f)
                curveToRelative(0.0f, 0.554f, -0.449f, 1.004f, -1.004f, 1.004f)
                horizontalLineToRelative(-4.49f)
                curveToRelative(-0.894f, 0.0f, -1.342f, -1.081f, -0.71f, -1.714f)
                lineToRelative(0.939f, -0.939f)
                curveToRelative(-1.412f, -0.875f, -3.047f, -1.348f, -4.735f, -1.348f)
                curveTo(7.184f, 3.0f, 3.235f, 6.765f, 3.01f, 11.57f)
                curveToRelative(-0.038f, 0.804f, -0.701f, 1.43f, -1.498f, 1.43f)
                close()
                moveTo(22.559f, 11.002f)
                curveToRelative(-0.855f, -0.031f, -1.53f, 0.601f, -1.568f, 1.428f)
                curveToRelative(-0.226f, 4.806f, -4.174f, 8.57f, -8.99f, 8.57f)
                curveToRelative(-1.687f, 0.0f, -3.322f, -0.473f, -4.735f, -1.348f)
                lineToRelative(0.939f, -0.939f)
                curveToRelative(0.632f, -0.632f, 0.184f, -1.714f, -0.71f, -1.714f)
                lineTo(3.004f, 16.999f)
                curveToRelative(-0.554f, 0.0f, -1.004f, 0.449f, -1.004f, 1.004f)
                verticalLineToRelative(4.491f)
                curveToRelative(0.0f, 0.894f, 1.081f, 1.342f, 1.713f, 0.71f)
                lineToRelative(1.393f, -1.393f)
                curveToRelative(2.01f, 1.414f, 4.408f, 2.189f, 6.893f, 2.189f)
                curveToRelative(6.421f, 0.0f, 11.687f, -5.021f, 11.986f, -11.43f)
                curveToRelative(0.039f, -0.828f, -0.601f, -1.53f, -1.428f, -1.568f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(13.5f, 11.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _restock!!
    }

private var _restock: ImageVector? = null
