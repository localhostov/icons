package me.localx.icons.rounded.outline

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

public val Icons.Outline.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.686f, 5.1f)
                curveToRelative(0.952f, -0.99f, 2.3f, -3.786f, 0.314f, -4.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                curveToRelative(0.0f, 1.235f, -1.127f, 2.546f, -3.0f, 2.9f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(4.9f)
                curveTo(9.127f, 4.546f, 8.0f, 3.235f, 8.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 1.0f)
                curveToRelative(-1.983f, 0.312f, -0.642f, 3.106f, 0.31f, 4.1f)
                arcTo(8.854f, 8.854f, 0.0f, false, false, 0.0f, 14.0f)
                curveToRelative(0.0f, 4.721f, 4.276f, 10.0f, 10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                curveTo(25.992f, 24.128f, 27.457f, 6.975f, 16.686f, 5.1f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                arcToRelative(8.322f, 8.322f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(-0.052f, -4.611f, 4.3f, -8.172f, 8.5f, -6.648f)
                arcTo(4.471f, 4.471f, 0.0f, false, true, 7.757f, 9.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.727f, 1.212f)
                curveToRelative(0.741f, 2.132f, 4.745f, -0.975f, 4.968f, -1.565f)
                curveToRelative(0.209f, 0.579f, 4.237f, 3.7f, 4.972f, 1.565f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.728f, -1.212f)
                arcTo(4.472f, 4.472f, 0.0f, false, true, 13.5f, 7.352f)
                curveTo(23.917f, 4.589f, 25.406f, 21.99f, 14.0f, 22.0f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
