package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(name = "Volume", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.79f, 4.256f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.121f)
                arcToRelative(7.952f, 7.952f, 0.0f, false, true, 0.0f, 11.246f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.121f)
                arcToRelative(10.951f, 10.951f, 0.0f, false, false, 0.0f, -15.488f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.652f, 12.0f)
                arcToRelative(4.354f, 4.354f, 0.0f, false, false, -3.243f, -4.2f)
                lineTo(15.409f, 1.68f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.638f, 0.205f)
                arcTo(12.055f, 12.055f, 0.0f, false, false, 6.252f, 4.772f)
                lineTo(5.5f, 4.772f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(3.456f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(0.754f)
                arcTo(12.055f, 12.055f, 0.0f, false, false, 13.638f, 23.8f)
                arcToRelative(1.462f, 1.462f, 0.0f, false, false, 0.271f, 0.025f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(15.409f, 16.2f)
                arcTo(4.354f, 4.354f, 0.0f, false, false, 18.652f, 12.0f)
                close()
                moveTo(12.409f, 20.322f)
                arcToRelative(9.088f, 9.088f, 0.0f, false, true, -4.124f, -3.415f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.256f, -0.679f)
                lineTo(5.5f, 16.228f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                lineTo(3.0f, 10.272f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineTo(7.029f, 7.772f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.256f, -0.679f)
                arcToRelative(9.088f, 9.088f, 0.0f, false, true, 4.124f, -3.415f)
                close()
            }
        }
        .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
