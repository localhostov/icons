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

public val Icons.Filled.ArrowAltFromTop: ImageVector
    get() {
        if (_arrowAltFromTop != null) {
            return _arrowAltFromTop!!
        }
        _arrowAltFromTop = Builder(name = "ArrowAltFromTop", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                lineToRelative(5.017f, 5.555f)
                curveToRelative(0.525f, 0.593f, 1.442f, 0.593f, 1.966f, 0.0f)
                lineToRelative(5.017f, -5.555f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _arrowAltFromTop!!
    }

private var _arrowAltFromTop: ImageVector? = null
