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

public val Icons.Bold.TachometerAverage: ImageVector
    get() {
        if (_tachometerAverage != null) {
            return _tachometerAverage!!
        }
        _tachometerAverage = Builder(name = "TachometerAverage", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.5f, -1.322f)
                lineTo(10.5f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(4.178f)
                arcTo(1.99f, 1.99f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(20.0f, 4.056f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.464f, 21.429f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.751f, 0.258f)
                lineTo(9.456f, 20.66f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.912f, -2.312f)
                lineTo(6.3f, 19.375f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, true, -0.7f, -0.056f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.79f, 0.014f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.7f, 0.059f)
                lineToRelative(-1.283f, -1.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.889f, 2.33f)
                lineToRelative(1.283f, 1.04f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, false, 4.718f, -0.276f)
                arcTo(12.056f, 12.056f, 0.0f, false, false, 20.0f, 4.056f)
                close()
            }
        }
        .build()
        return _tachometerAverage!!
    }

private var _tachometerAverage: ImageVector? = null
