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

public val Icons.Filled.ArrowAltFromBottom: ImageVector
    get() {
        if (_arrowAltFromBottom != null) {
            return _arrowAltFromBottom!!
        }
        _arrowAltFromBottom = Builder(name = "ArrowAltFromBottom", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(12.983f, 0.445f)
                curveToRelative(-0.525f, -0.593f, -1.442f, -0.593f, -1.966f, 0.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _arrowAltFromBottom!!
    }

private var _arrowAltFromBottom: ImageVector? = null
