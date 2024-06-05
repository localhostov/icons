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

public val Icons.Bold.HashtagLock: ImageVector
    get() {
        if (_hashtagLock != null) {
            return _hashtagLock!!
        }
        _hashtagLock = Builder(name = "HashtagLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.702f, 15.0f)
                horizontalLineToRelative(2.298f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.659f)
                lineToRelative(-0.721f, 6.0f)
                horizontalLineToRelative(-3.019f)
                lineToRelative(0.721f, -6.0f)
                lineTo(0.0f, 18.0f)
                lineToRelative(0.353f, -3.0f)
                horizontalLineToRelative(5.33f)
                lineToRelative(0.721f, -6.0f)
                lineTo(0.0f, 9.0f)
                lineToRelative(0.353f, -3.0f)
                horizontalLineToRelative(6.411f)
                lineToRelative(0.721f, -6.0f)
                horizontalLineToRelative(3.019f)
                lineToRelative(-0.721f, 6.0f)
                horizontalLineToRelative(5.876f)
                lineToRelative(0.721f, -6.0f)
                horizontalLineToRelative(3.019f)
                lineToRelative(-0.721f, 6.0f)
                horizontalLineToRelative(5.323f)
                lineToRelative(-0.353f, 3.0f)
                horizontalLineToRelative(-0.468f)
                curveToRelative(-1.183f, -1.23f, -2.842f, -2.0f, -4.679f, -2.0f)
                reflectiveCurveToRelative(-3.496f, 0.77f, -4.679f, 2.0f)
                horizontalLineToRelative(-4.398f)
                lineToRelative(-0.721f, 6.0f)
                close()
                moveTo(23.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _hashtagLock!!
    }

private var _hashtagLock: ImageVector? = null
