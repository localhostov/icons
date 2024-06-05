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

public val Icons.Bold.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) {
            return _swipeLeft!!
        }
        _swipeLeft = Builder(name = "SwipeLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 3.58f)
                curveToRelative(0.0f, -0.747f, -0.536f, -1.44f, -1.273f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.739f, 0.568f, -1.739f, 1.479f)
                verticalLineToRelative(15.195f)
                lineToRelative(-2.64f, -2.222f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(5.266f, 4.391f)
                lineToRelative(15.0f, -0.009f)
                verticalLineToRelative(-11.15f)
                lineToRelative(-12.0f, -3.13f)
                lineTo(9.001f, 3.58f)
                close()
                moveTo(18.0f, 15.159f)
                verticalLineToRelative(5.836f)
                lineToRelative(-9.0f, 0.012f)
                verticalLineToRelative(-8.196f)
                lineToRelative(9.0f, 2.348f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(-3.74f, -3.372f)
                curveToRelative(-0.347f, -0.347f, -0.347f, -0.91f, 0.0f, -1.257f)
                lineToRelative(3.74f, -3.371f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
