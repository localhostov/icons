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

public val Icons.Bold.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.957f, 8.0f)
                lineToRelative(3.018f, -5.235f)
                lineTo(21.234f, 0.024f)
                lineToRelative(-5.234f, 3.019f)
                verticalLineToRelative(2.835f)
                lineToRelative(-5.75f, 5.75f)
                lineToRelative(-1.768f, -1.768f)
                lineToRelative(-7.311f, 7.311f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.097f, 0.0f, 5.656f)
                curveToRelative(0.755f, 0.756f, 1.76f, 1.172f, 2.829f, 1.172f)
                reflectiveCurveToRelative(2.073f, -0.416f, 2.828f, -1.172f)
                lineToRelative(7.311f, -7.311f)
                lineToRelative(-1.768f, -1.768f)
                lineToRelative(5.75f, -5.75f)
                horizontalLineToRelative(2.835f)
                close()
                moveTo(4.707f, 20.707f)
                curveToRelative(-0.377f, 0.379f, -1.036f, 0.379f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(5.189f, -5.189f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.19f, 5.189f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
