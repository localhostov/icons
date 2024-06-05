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

public val Icons.Bold.Booking: ImageVector
    get() {
        if (_booking != null) {
            return _booking!!
        }
        _booking = Builder(name = "Booking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.406f, 17.0f)
                curveToRelative(-0.707f, 0.873f, -0.987f, 1.953f, -0.862f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.816f)
                lineToRelative(-3.0f, -0.857f)
                verticalLineToRelative(-6.459f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.406f)
                close()
                moveTo(15.0f, 15.682f)
                verticalLineToRelative(-4.182f)
                curveToRelative(0.0f, -0.747f, -0.536f, -1.44f, -1.273f, -1.56f)
                curveToRelative(-0.94f, -0.153f, -1.739f, 0.568f, -1.739f, 1.479f)
                lineToRelative(0.013f, 7.388f)
                lineToRelative(-1.152f, -0.835f)
                curveToRelative(-0.866f, -0.722f, -2.153f, -0.604f, -2.874f, 0.261f)
                curveToRelative(-0.722f, 0.866f, -0.605f, 2.153f, 0.261f, 2.874f)
                lineToRelative(3.766f, 2.891f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.198f)
                lineToRelative(6.0f, 1.714f)
                verticalLineToRelative(3.484f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.747f)
                lineToRelative(-9.0f, -2.572f)
                close()
            }
        }
        .build()
        return _booking!!
    }

private var _booking: ImageVector? = null
