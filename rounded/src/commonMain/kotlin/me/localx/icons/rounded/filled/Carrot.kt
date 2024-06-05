package me.localx.icons.rounded.filled

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
                moveTo(23.0f, 5.0f)
                horizontalLineTo(20.414f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(19.0f, 3.586f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(5.456f)
                arcTo(10.139f, 10.139f, 0.0f, false, false, 14.146f, 3.33f)
                arcTo(3.754f, 3.754f, 0.0f, false, false, 9.759f, 4.345f)
                lineToRelative(2.948f, 2.948f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineTo(8.521f, 5.936f)
                curveTo(7.384f, 7.605f, 5.86f, 10.2f, 4.334f, 12.92f)
                lineToRelative(2.373f, 2.373f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineTo(3.322f, 14.736f)
                curveTo(2.215f, 16.742f, 1.156f, 18.712f, 0.3f, 20.319f)
                arcTo(2.511f, 2.511f, 0.0f, false, false, 3.681f, 23.7f)
                curveToRelative(2.825f, -1.5f, 6.762f, -3.633f, 10.055f, -5.55f)
                lineToRelative(-2.443f, -2.443f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, -1.414f)
                lineTo(15.512f, 17.1f)
                arcToRelative(27.061f, 27.061f, 0.0f, false, false, 4.11f, -2.821f)
                arcToRelative(3.766f, 3.766f, 0.0f, false, false, 1.049f, -4.422f)
                arcTo(10.167f, 10.167f, 0.0f, false, false, 18.544f, 7.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 5.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
