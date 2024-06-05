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

public val Icons.Filled.KissWinkHeart: ImageVector
    get() {
        if (_kissWinkHeart != null) {
            return _kissWinkHeart!!
        }
        _kissWinkHeart = Builder(name = "KissWinkHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.83f, 21.271f)
                curveToRelative(-0.9f, 2.008f, -5.233f, 2.7f, -5.233f, 2.7f)
                reflectiveCurveToRelative(-2.285f, -3.893f, -1.388f, -5.9f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 2.424f, -0.922f)
                arcToRelative(1.931f, 1.931f, 0.0f, false, true, 0.886f, 2.521f)
                arcTo(1.839f, 1.839f, 0.0f, true, true, 23.83f, 21.271f)
                close()
                moveTo(16.012f, 23.3f)
                curveTo(8.435f, 26.16f, -0.16f, 20.134f, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(8.426f, -0.19f, 14.469f, 9.047f, 11.051f, 16.684f)
                arcToRelative(3.676f, 3.676f, 0.0f, false, false, -1.1f, -0.105f)
                arcTo(3.787f, 3.787f, 0.0f, false, false, 20.5f, 15.351f)
                arcToRelative(3.724f, 3.724f, 0.0f, false, false, -2.93f, -0.147f)
                arcToRelative(3.821f, 3.821f, 0.0f, false, false, -2.19f, 2.053f)
                curveTo(14.534f, 19.157f, 15.265f, 21.6f, 16.012f, 23.3f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(11.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissWinkHeart!!
    }

private var _kissWinkHeart: ImageVector? = null
