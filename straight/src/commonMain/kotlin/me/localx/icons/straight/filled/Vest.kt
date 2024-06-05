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

public val Icons.Filled.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.59f, 0.209f)
                lineToRelative(4.41f, 11.969f)
                verticalLineToRelative(11.822f)
                lineTo(1.0f, 24.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.0f, 15.0f)
                verticalLineToRelative(-3.368f)
                curveToRelative(0.681f, -0.801f, 2.0f, -2.699f, 2.0f, -3.632f)
                lineTo(3.0f, 3.394f)
                curveToRelative(0.0f, -1.358f, 0.905f, -2.549f, 2.202f, -2.896f)
                curveToRelative(0.471f, -0.126f, 0.943f, -0.219f, 1.388f, -0.289f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.019f, 0.0f, -0.148f, 0.0f, -0.352f, 0.008f)
                lineToRelative(3.352f, 9.099f)
                lineTo(15.352f, 0.008f)
                curveToRelative(-0.205f, -0.008f, -0.333f, -0.008f, -0.352f, -0.008f)
                close()
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(-3.369f)
                curveToRelative(-0.574f, -0.673f, -2.0f, -2.658f, -2.0f, -3.631f)
                lineTo(21.0f, 3.394f)
                curveToRelative(0.0f, -1.358f, -0.905f, -2.549f, -2.202f, -2.896f)
                curveToRelative(-0.471f, -0.126f, -0.943f, -0.219f, -1.388f, -0.289f)
                lineToRelative(-4.41f, 11.969f)
                verticalLineToRelative(11.822f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
