package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.406f, 7.228f)
                arcTo(3.009f, 3.009f, 0.0f, false, false, 18.986f, 6.0f)
                lineTo(5.014f, 6.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -2.42f, 1.228f)
                lineTo(0.547f, 10.021f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, 0.344f, 3.936f)
                lineTo(12.0f, 23.931f)
                lineTo(23.146f, 13.923f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 0.307f, -3.9f)
                close()
                moveTo(7.309f, 13.0f)
                lineToRelative(2.305f, 6.1f)
                lineTo(2.816f, 13.0f)
                close()
                moveTo(14.553f, 13.0f)
                lineTo(12.0f, 19.757f)
                lineTo(9.447f, 13.0f)
                close()
                moveTo(9.477f, 11.0f)
                lineToRelative(1.2f, -3.0f)
                horizontalLineToRelative(2.646f)
                lineToRelative(1.2f, 3.0f)
                close()
                moveTo(16.691f, 13.0f)
                horizontalLineToRelative(4.491f)
                lineToRelative(-6.8f, 6.1f)
                close()
                moveTo(19.791f, 8.409f)
                lineTo(21.692f, 11.0f)
                lineTo(16.677f, 11.0f)
                lineToRelative(-1.2f, -3.0f)
                horizontalLineToRelative(3.509f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.793f, 8.409f)
                close()
                moveTo(4.205f, 8.409f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.014f, 8.0f)
                lineTo(8.523f, 8.0f)
                lineToRelative(-1.2f, 3.0f)
                lineTo(2.308f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1571f, 3.7129f)
                lineToRelative(1.9998f, -3.1431f)
                lineToRelative(1.688f, 1.074f)
                lineToRelative(-1.9998f, 3.1431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1564f, 1.6521f)
                lineToRelative(1.6872f, -1.074f)
                lineToRelative(1.9998f, 3.1415f)
                lineToRelative(-1.6872f, 1.074f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
