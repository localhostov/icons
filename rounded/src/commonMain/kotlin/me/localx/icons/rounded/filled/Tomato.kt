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

public val Icons.Filled.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8f, 5.016f)
                curveToRelative(1.047f, -0.61f, 3.313f, -3.1f, 1.513f, -3.964f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.265f, 0.632f)
                arcTo(3.465f, 3.465f, 0.0f, false, true, 13.0f, 3.93f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(3.93f)
                arcTo(3.462f, 3.462f, 0.0f, false, true, 7.949f, 1.684f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.265f, -0.632f)
                curveTo(4.882f, 1.92f, 7.147f, 4.4f, 8.2f, 5.016f)
                arcTo(8.786f, 8.786f, 0.0f, false, false, 0.0f, 14.0f)
                curveToRelative(0.0f, 4.721f, 4.276f, 10.0f, 10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                curveTo(26.507f, 24.063f, 27.352f, 5.878f, 15.8f, 5.016f)
                close()
                moveTo(16.97f, 9.242f)
                curveToRelative(-0.738f, 2.131f, -4.747f, -0.973f, -4.97f, -1.562f)
                curveToRelative(-0.211f, 0.579f, -4.235f, 3.7f, -4.97f, 1.562f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.757f, 8.03f)
                arcTo(4.188f, 4.188f, 0.0f, false, false, 10.711f, 6.0f)
                horizontalLineToRelative(2.577f)
                arcToRelative(4.187f, 4.187f, 0.0f, false, false, 2.954f, 2.03f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.97f, 9.242f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
