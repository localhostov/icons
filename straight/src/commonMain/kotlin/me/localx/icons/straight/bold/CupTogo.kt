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

public val Icons.Bold.CupTogo: ImageVector
    get() {
        if (_cupTogo != null) {
            return _cupTogo!!
        }
        _cupTogo = Builder(name = "CupTogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.73f, 5.0f)
                lineToRelative(-0.437f, -2.186f)
                curveToRelative(-0.326f, -1.63f, -1.77f, -2.814f, -3.432f, -2.814f)
                lineTo(6.14f, 0.0f)
                curveToRelative(-1.663f, 0.0f, -3.106f, 1.184f, -3.432f, 2.814f)
                lineToRelative(-0.437f, 2.186f)
                lineTo(0.999f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.167f)
                lineToRelative(1.524f, 12.91f)
                curveToRelative(0.208f, 1.761f, 1.702f, 3.09f, 3.476f, 3.09f)
                horizontalLineToRelative(9.667f)
                curveToRelative(1.773f, 0.0f, 3.268f, -1.328f, 3.476f, -3.09f)
                lineToRelative(1.524f, -12.91f)
                horizontalLineToRelative(1.167f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.269f)
                close()
                moveTo(5.649f, 3.402f)
                curveToRelative(0.047f, -0.233f, 0.253f, -0.402f, 0.491f, -0.402f)
                horizontalLineToRelative(11.721f)
                curveToRelative(0.238f, 0.0f, 0.444f, 0.169f, 0.491f, 0.402f)
                lineToRelative(0.32f, 1.598f)
                lineTo(5.329f, 5.0f)
                lineToRelative(0.32f, -1.598f)
                close()
                moveTo(17.329f, 20.558f)
                curveToRelative(-0.03f, 0.252f, -0.243f, 0.442f, -0.497f, 0.442f)
                lineTo(7.166f, 21.0f)
                curveToRelative(-0.253f, 0.0f, -0.467f, -0.189f, -0.497f, -0.441f)
                lineToRelative(-0.302f, -2.559f)
                horizontalLineToRelative(11.264f)
                lineToRelative(-0.302f, 2.558f)
                close()
                moveTo(18.457f, 11.0f)
                lineTo(5.541f, 11.0f)
                lineToRelative(-0.354f, -3.0f)
                horizontalLineToRelative(13.625f)
                lineToRelative(-0.354f, 3.0f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
