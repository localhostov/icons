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

public val Icons.Filled.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                horizontalLineTo(20.414f)
                lineToRelative(3.293f, -3.293f)
                lineTo(22.293f, 0.293f)
                lineTo(19.0f, 3.586f)
                verticalLineTo(0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.456f)
                arcTo(10.139f, 10.139f, 0.0f, false, false, 14.146f, 3.33f)
                arcTo(3.754f, 3.754f, 0.0f, false, false, 9.759f, 4.345f)
                lineToRelative(3.64f, 3.64f)
                lineTo(11.985f, 9.4f)
                lineTo(8.55f, 5.964f)
                curveToRelative(-0.759f, 1.208f, -1.635f, 2.863f, -2.518f, 4.654f)
                lineTo(9.284f, 13.87f)
                lineTo(7.87f, 15.284f)
                lineTo(5.112f, 12.526f)
                curveToRelative(-1.935f, 4.09f, -3.7f, 8.28f, -4.035f, 9.089f)
                lineTo(0.139f, 23.861f)
                lineToRelative(2.247f, -0.938f)
                curveToRelative(1.083f, -0.453f, 8.248f, -3.467f, 13.1f, -6.024f)
                lineTo(12.7f, 14.111f)
                lineTo(14.111f, 12.7f)
                lineToRelative(3.2f, 3.2f)
                arcToRelative(12.507f, 12.507f, 0.0f, false, false, 2.316f, -1.615f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, false, 1.049f, -4.422f)
                arcTo(10.167f, 10.167f, 0.0f, false, false, 18.544f, 7.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
