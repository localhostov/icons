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

public val Icons.Outline.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.047f, 6.275f)
                curveTo(15.316f, 4.234f, 16.7f, 3.0f, 18.0f, 3.0f)
                lineTo(18.0f, 1.0f)
                arcToRelative(5.439f, 5.439f, 0.0f, false, false, -5.0f, 5.026f)
                horizontalLineToRelative(0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 6.026f)
                arcTo(5.439f, 5.439f, 0.0f, false, false, 6.0f, 1.0f)
                lineTo(6.0f, 3.0f)
                curveTo(7.3f, 3.0f, 8.684f, 4.234f, 8.953f, 6.275f)
                curveTo(3.781f, 7.324f, 3.0f, 11.2f, 3.0f, 15.0f)
                curveToRelative(0.0f, 4.45f, 1.069f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.55f, 9.0f, -9.0f)
                curveTo(21.0f, 11.2f, 20.219f, 7.324f, 15.047f, 6.275f)
                close()
                moveTo(16.2f, 8.7f)
                arcToRelative(4.107f, 4.107f, 0.0f, false, true, 2.149f, 2.128f)
                lineToRelative(-2.8f, 2.8f)
                lineToRelative(-2.138f, -2.138f)
                close()
                moveTo(14.133f, 15.044f)
                lineTo(12.0f, 17.18f)
                lineTo(9.859f, 15.041f)
                lineTo(12.0f, 12.9f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(15.718f, 15.718f, 0.0f, false, true, 1.961f, 0.111f)
                lineTo(12.0f, 10.075f)
                lineTo(10.034f, 8.112f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 12.0f, 8.0f)
                close()
                moveTo(7.793f, 8.7f)
                lineTo(10.584f, 11.491f)
                lineTo(8.445f, 13.627f)
                lineToRelative(-2.8f, -2.8f)
                arcTo(4.117f, 4.117f, 0.0f, false, true, 7.793f, 8.7f)
                close()
                moveTo(5.0f, 15.0f)
                arcToRelative(17.939f, 17.939f, 0.0f, false, true, 0.088f, -1.9f)
                lineToRelative(1.943f, 1.943f)
                lineTo(5.1f, 16.977f)
                arcTo(17.657f, 17.657f, 0.0f, false, true, 5.0f, 15.0f)
                close()
                moveTo(5.672f, 19.229f)
                lineTo(8.445f, 16.455f)
                lineTo(10.583f, 18.594f)
                lineTo(7.85f, 21.327f)
                arcTo(4.121f, 4.121f, 0.0f, false, true, 5.672f, 19.229f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(15.987f, 15.987f, 0.0f, false, true, -1.892f, -0.1f)
                lineTo(12.0f, 20.008f)
                lineToRelative(1.89f, 1.89f)
                arcTo(16.115f, 16.115f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(16.146f, 21.328f)
                lineTo(13.411f, 18.594f)
                lineTo(15.55f, 16.455f)
                lineTo(18.326f, 19.232f)
                arcTo(4.118f, 4.118f, 0.0f, false, true, 16.146f, 21.328f)
                close()
                moveTo(18.9f, 16.981f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(1.947f, -1.947f)
                arcTo(17.992f, 17.992f, 0.0f, false, true, 19.0f, 15.0f)
                arcTo(17.718f, 17.718f, 0.0f, false, true, 18.9f, 16.981f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
