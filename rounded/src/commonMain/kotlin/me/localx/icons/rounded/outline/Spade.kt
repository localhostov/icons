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

public val Icons.Outline.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.5f)
                curveToRelative(0.0f, -4.363f, -4.846f, -9.756f, -7.709f, -12.255f)
                arcToRelative(5.029f, 5.029f, 0.0f, false, false, -6.583f, 0.0f)
                curveTo(5.846f, 3.745f, 1.0f, 9.138f, 1.0f, 13.5f)
                arcTo(6.271f, 6.271f, 0.0f, false, false, 7.0f, 20.0f)
                arcToRelative(5.824f, 5.824f, 0.0f, false, false, 3.93f, -1.658f)
                curveTo(10.75f, 20.805f, 10.115f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-2.115f, 0.0f, -2.75f, -1.2f, -2.93f, -3.658f)
                arcTo(5.824f, 5.824f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(6.271f, 6.271f, 0.0f, false, false, 23.0f, 13.5f)
                close()
                moveTo(12.9f, 14.917f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 14.365f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.893f, 0.55f)
                curveTo(11.091f, 14.945f, 9.514f, 18.0f, 7.0f, 18.0f)
                arcToRelative(4.277f, 4.277f, 0.0f, false, true, -4.0f, -4.5f)
                curveToRelative(0.0f, -3.032f, 3.533f, -7.7f, 7.023f, -10.747f)
                arcToRelative(3.019f, 3.019f, 0.0f, false, true, 3.954f, 0.0f)
                curveTo(17.467f, 5.8f, 21.0f, 10.47f, 21.0f, 13.5f)
                arcTo(4.277f, 4.277f, 0.0f, false, true, 17.0f, 18.0f)
                curveTo(14.485f, 18.0f, 12.909f, 14.945f, 12.9f, 14.917f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
