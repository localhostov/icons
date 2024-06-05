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

public val Icons.Outline.ArrowAltUp: ImageVector
    get() {
        if (_arrowAltUp != null) {
            return _arrowAltUp!!
        }
        _arrowAltUp = Builder(name = "ArrowAltUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.079f, 6.0f)
                lineTo(12.996f, 0.445f)
                curveToRelative(-0.532f, -0.593f, -1.461f, -0.593f, -1.993f, 0.0f)
                lineTo(5.921f, 6.0f)
                horizontalLineToRelative(5.079f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(5.079f)
                close()
            }
        }
        .build()
        return _arrowAltUp!!
    }

private var _arrowAltUp: ImageVector? = null
