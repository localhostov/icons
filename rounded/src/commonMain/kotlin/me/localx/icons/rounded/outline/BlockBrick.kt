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

public val Icons.Outline.BlockBrick: ImageVector
    get() {
        if (_blockBrick != null) {
            return _blockBrick!!
        }
        _blockBrick = Builder(name = "BlockBrick", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(4.0f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _blockBrick!!
    }

private var _blockBrick: ImageVector? = null
