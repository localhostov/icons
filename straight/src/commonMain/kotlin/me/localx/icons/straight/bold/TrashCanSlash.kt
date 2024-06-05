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

public val Icons.Bold.TrashCanSlash: ImageVector
    get() {
        if (_trashCanSlash != null) {
            return _trashCanSlash!!
        }
        _trashCanSlash = Builder(name = "TrashCanSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.879f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.879f)
                lineTo(2.123f, 0.002f)
                lineTo(0.002f, 2.123f)
                lineToRelative(21.875f, 21.875f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.998f, -2.998f)
                close()
                moveTo(18.0f, 15.879f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-4.879f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.879f)
                lineToRelative(-4.879f, -4.879f)
                horizontalLineToRelative(9.879f)
                verticalLineToRelative(9.879f)
                close()
                moveTo(11.0f, 15.95f)
                verticalLineToRelative(2.051f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.051f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(16.051f, 21.001f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(-0.162f, 0.033f, -0.329f, 0.05f, -0.5f, 0.05f)
                lineTo(5.5f, 24.001f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 7.95f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(10.05f)
                horizontalLineToRelative(10.051f)
                close()
            }
        }
        .build()
        return _trashCanSlash!!
    }

private var _trashCanSlash: ImageVector? = null
