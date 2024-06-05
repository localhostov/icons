package me.localx.icons.straight.outline

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

public val Icons.Outline.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.487f, 1.317f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.21f, 4.111f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 11.0f, 11.958f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.958f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 23.79f, 4.111f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.487f, 1.317f)
                close()
                moveTo(2.169f, 2.44f)
                arcTo(0.987f, 0.987f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.932f, 1.371f)
                curveToRelative(-0.083f, 0.208f, -0.177f, 0.418f, -0.279f, 0.629f)
                horizontalLineTo(2.347f)
                curveToRelative(-0.1f, -0.211f, -0.2f, -0.421f, -0.279f, -0.629f)
                arcTo(0.985f, 0.985f, 0.0f, false, true, 2.169f, 2.44f)
                close()
                moveTo(12.0f, 10.0f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 3.619f, 6.0f)
                horizontalLineTo(20.381f)
                arcTo(10.5f, 10.5f, 0.0f, false, true, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
