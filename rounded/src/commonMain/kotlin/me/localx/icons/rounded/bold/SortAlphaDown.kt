package me.localx.icons.rounded.bold

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

public val Icons.Bold.SortAlphaDown: ImageVector
    get() {
        if (_sortAlphaDown != null) {
            return _sortAlphaDown!!
        }
        _sortAlphaDown = Builder(name = "SortAlphaDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.112f)
                curveToRelative(-0.867f, 0.0f, -1.666f, -0.471f, -2.087f, -1.229f)
                curveToRelative(-0.42f, -0.759f, -0.396f, -1.686f, 0.062f, -2.421f)
                curveToRelative(0.046f, -0.073f, 3.859f, -4.351f, 3.859f, -4.351f)
                horizontalLineToRelative(-2.723f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.112f)
                curveToRelative(0.867f, 0.0f, 1.666f, 0.471f, 2.087f, 1.229f)
                curveToRelative(0.42f, 0.759f, 0.396f, 1.686f, -0.062f, 2.421f)
                curveToRelative(-0.046f, 0.073f, -3.859f, 4.351f, -3.859f, 4.351f)
                horizontalLineToRelative(2.723f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.0f, 4.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(15.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(20.5f, 5.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.945f, 17.434f)
                lineToRelative(-1.945f, 1.923f)
                lineTo(8.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                lineTo(5.0f, 19.357f)
                lineToRelative(-1.945f, -1.923f)
                curveToRelative(-0.588f, -0.583f, -1.539f, -0.578f, -2.121f, 0.012f)
                curveToRelative(-0.583f, 0.589f, -0.577f, 1.539f, 0.012f, 2.121f)
                lineToRelative(3.787f, 3.744f)
                curveToRelative(0.488f, 0.488f, 1.129f, 0.731f, 1.77f, 0.731f)
                reflectiveCurveToRelative(1.276f, -0.242f, 1.76f, -0.726f)
                lineToRelative(3.793f, -3.75f)
                curveToRelative(0.589f, -0.582f, 0.595f, -1.532f, 0.012f, -2.121f)
                curveToRelative(-0.582f, -0.59f, -1.532f, -0.595f, -2.121f, -0.012f)
                close()
            }
        }
        .build()
        return _sortAlphaDown!!
    }

private var _sortAlphaDown: ImageVector? = null
