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

public val Icons.Bold.ArrowAltDown: ImageVector
    get() {
        if (_arrowAltDown != null) {
            return _arrowAltDown!!
        }
        _arrowAltDown = Builder(name = "ArrowAltDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.921f)
                lineToRelative(5.083f, 5.555f)
                curveToRelative(0.532f, 0.593f, 1.461f, 0.593f, 1.993f, 0.0f)
                lineToRelative(5.083f, -5.555f)
                horizontalLineToRelative(-4.579f)
                close()
            }
        }
        .build()
        return _arrowAltDown!!
    }

private var _arrowAltDown: ImageVector? = null
