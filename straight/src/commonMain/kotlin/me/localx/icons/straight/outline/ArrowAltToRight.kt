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

public val Icons.Outline.ArrowAltToRight: ImageVector
    get() {
        if (_arrowAltToRight != null) {
            return _arrowAltToRight!!
        }
        _arrowAltToRight = Builder(name = "ArrowAltToRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 0.36f, -0.148f, 0.721f, -0.445f, 0.983f)
                lineToRelative(-5.555f, 5.017f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 6.0f)
                lineToRelative(5.555f, 5.017f)
                curveToRelative(0.297f, 0.262f, 0.445f, 0.623f, 0.445f, 0.983f)
                close()
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _arrowAltToRight!!
    }

private var _arrowAltToRight: ImageVector? = null
