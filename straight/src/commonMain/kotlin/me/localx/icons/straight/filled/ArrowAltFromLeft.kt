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

public val Icons.Filled.ArrowAltFromLeft: ImageVector
    get() {
        if (_arrowAltFromLeft != null) {
            return _arrowAltFromLeft!!
        }
        _arrowAltFromLeft = Builder(name = "ArrowAltFromLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.555f, 11.083f)
                lineToRelative(-5.555f, -5.083f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(5.159f)
                lineToRelative(5.555f, -5.083f)
                curveToRelative(0.593f, -0.532f, 0.593f, -1.461f, 0.0f, -1.993f)
                close()
            }
        }
        .build()
        return _arrowAltFromLeft!!
    }

private var _arrowAltFromLeft: ImageVector? = null
