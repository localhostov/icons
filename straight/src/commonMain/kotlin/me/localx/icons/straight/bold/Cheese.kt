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

public val Icons.Bold.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 16.0f)
                close()
                moveTo(8.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 17.0f)
                close()
                moveTo(24.0f, 8.771f)
                verticalLineTo(24.0f)
                horizontalLineTo(5.227f)
                arcToRelative(4.463f, 4.463f, 0.0f, false, true, -4.085f, -2.614f)
                arcToRelative(13.319f, 13.319f, 0.0f, false, true, -0.518f, -9.41f)
                curveToRelative(0.4f, -1.443f, 2.257f, -7.282f, 7.12f, -10.917f)
                arcTo(5.461f, 5.461f, 0.0f, false, true, 14.029f, 0.933f)
                close()
                moveTo(5.581f, 8.0f)
                horizontalLineTo(18.167f)
                lineTo(12.321f, 3.4f)
                arcTo(2.541f, 2.541f, 0.0f, false, false, 10.983f, 3.0f)
                arcToRelative(2.262f, 2.262f, 0.0f, false, false, -1.443f, 0.462f)
                arcTo(15.483f, 15.483f, 0.0f, false, false, 5.581f, 8.0f)
                close()
                moveTo(21.0f, 11.0f)
                horizontalLineTo(5.227f)
                arcToRelative(1.462f, 1.462f, 0.0f, false, false, -1.347f, 0.838f)
                arcTo(11.193f, 11.193f, 0.0f, false, false, 3.0f, 16.0f)
                arcToRelative(10.277f, 10.277f, 0.0f, false, false, 0.88f, 4.162f)
                arcTo(1.462f, 1.462f, 0.0f, false, false, 5.227f, 21.0f)
                horizontalLineTo(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.305f, -2.984f)
                arcTo(3.075f, 3.075f, 0.0f, false, true, 14.99f, 21.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
