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

public val Icons.Outline.FonduePot: ImageVector
    get() {
        if (_fonduePot != null) {
            return _fonduePot!!
        }
        _fonduePot = Builder(name = "FonduePot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.144f, 8.0f)
                lineToRelative(3.407f, -5.719f)
                lineToRelative(-1.719f, -1.023f)
                lineToRelative(-4.017f, 6.743f)
                horizontalLineToRelative(-2.684f)
                lineToRelative(1.689f, -7.393f)
                lineToRelative(-1.949f, -0.445f)
                lineToRelative(-1.791f, 7.838f)
                horizontalLineToRelative(-4.897f)
                lineTo(3.167f, 1.257f)
                lineToRelative(-1.718f, 1.023f)
                lineToRelative(3.407f, 5.719f)
                lineTo(0.0f, 7.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.77f, 1.415f, 5.215f, 3.56f, 6.651f)
                lineToRelative(-1.977f, 4.349f)
                horizontalLineToRelative(2.198f)
                lineToRelative(1.363f, -3.0f)
                horizontalLineToRelative(9.712f)
                lineToRelative(1.363f, 3.0f)
                horizontalLineToRelative(2.197f)
                lineToRelative(-1.977f, -4.348f)
                curveToRelative(2.145f, -1.437f, 3.56f, -3.882f, 3.56f, -6.652f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.856f)
                close()
                moveTo(20.0f, 13.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _fonduePot!!
    }

private var _fonduePot: ImageVector? = null
