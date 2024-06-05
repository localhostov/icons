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

public val Icons.Filled.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) {
            return _phonePlus!!
        }
        _phonePlus = Builder(name = "PhonePlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 4.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(23.878f, 19.113f)
                lineToRelative(-3.171f, 3.171f)
                curveToRelative(-1.104f, 1.106f, -2.599f, 1.715f, -4.207f, 1.715f)
                curveTo(9.252f, 24.0f, 0.0f, 14.748f, 0.0f, 7.5f)
                curveToRelative(0.0f, -1.609f, 0.609f, -3.104f, 1.717f, -4.208f)
                lineTo(4.887f, 0.122f)
                lineToRelative(6.265f, 6.266f)
                lineToRelative(-4.125f, 4.125f)
                curveToRelative(1.373f, 3.062f, 3.493f, 5.187f, 6.453f, 6.469f)
                lineToRelative(4.133f, -4.133f)
                lineToRelative(6.265f, 6.265f)
                close()
            }
        }
        .build()
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
