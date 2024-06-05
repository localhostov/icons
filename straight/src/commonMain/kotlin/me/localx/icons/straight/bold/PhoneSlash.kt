package me.localx.icons.straight.bold

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

public val Icons.Bold.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.814f, 0.064f)
                lineTo(10.256f, 11.623f)
                arcToRelative(12.246f, 12.246f, 0.0f, false, true, -1.167f, -1.93f)
                lineToRelative(2.963f, -2.962f)
                lineTo(5.41f, 0.09f)
                lineTo(1.766f, 3.734f)
                arcTo(6.055f, 6.055f, 0.0f, false, false, 0.0f, 8.058f)
                curveTo(0.0f, 11.089f, 1.577f, 14.55f, 4.277f, 17.6f)
                lineTo(0.064f, 21.814f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(21.75f, -21.75f)
                close()
                moveTo(3.0f, 8.058f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, true, 0.886f, -2.2f)
                lineTo(5.41f, 4.332f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.541f, 9.0f)
                lineToRelative(0.369f, 0.919f)
                arcToRelative(15.388f, 15.388f, 0.0f, false, false, 2.216f, 3.835f)
                lineToRelative(-1.72f, 1.72f)
                curveTo(4.281f, 13.02f, 3.0f, 10.3f, 3.0f, 8.058f)
                close()
                moveTo(17.269f, 11.948f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-3.645f, 3.645f)
                arcTo(6.055f, 6.055f, 0.0f, false, true, 15.942f, 24.0f)
                arcTo(14.207f, 14.207f, 0.0f, false, true, 8.13f, 21.074f)
                lineToRelative(2.162f, -2.163f)
                arcTo(10.916f, 10.916f, 0.0f, false, false, 15.942f, 21.0f)
                arcToRelative(3.076f, 3.076f, 0.0f, false, false, 2.2f, -0.885f)
                lineToRelative(1.524f, -1.525f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.255f, 2.256f)
                lineToRelative(-0.908f, -0.346f)
                arcToRelative(15.032f, 15.032f, 0.0f, false, true, -2.033f, -0.97f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
