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

public val Icons.Outline.DistributeSpacingHorizontal: ImageVector
    get() {
        if (_distributeSpacingHorizontal != null) {
            return _distributeSpacingHorizontal!!
        }
        _distributeSpacingHorizontal = Builder(name = "DistributeSpacingHorizontal", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 24.0f)
                close()
                moveTo(4.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                lineTo(2.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 0.0f)
                close()
                moveTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 20.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 6.0f)
                close()
            }
        }
        .build()
        return _distributeSpacingHorizontal!!
    }

private var _distributeSpacingHorizontal: ImageVector? = null
