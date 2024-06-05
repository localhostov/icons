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

public val Icons.Outline.HashtagLock: ImageVector
    get() {
        if (_hashtagLock != null) {
            return _hashtagLock!!
        }
        _hashtagLock = Builder(name = "HashtagLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.198f, 15.0f)
                horizontalLineToRelative(1.802f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.042f)
                lineToRelative(-0.841f, 7.0f)
                horizontalLineToRelative(-2.012f)
                lineToRelative(0.841f, -7.0f)
                lineTo(0.0f, 17.0f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(5.951f)
                lineToRelative(0.721f, -6.0f)
                lineTo(0.706f, 9.0f)
                lineToRelative(0.235f, -2.0f)
                horizontalLineToRelative(6.206f)
                lineToRelative(0.841f, -7.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(-0.841f, 7.0f)
                horizontalLineToRelative(6.883f)
                lineToRelative(0.841f, -7.0f)
                horizontalLineToRelative(2.012f)
                lineToRelative(-0.841f, 7.0f)
                horizontalLineToRelative(5.946f)
                lineToRelative(-0.235f, 2.0f)
                horizontalLineToRelative(-1.305f)
                curveToRelative(-1.099f, -1.224f, -2.688f, -2.0f, -4.46f, -2.0f)
                reflectiveCurveToRelative(-3.36f, 0.776f, -4.46f, 2.0f)
                horizontalLineToRelative(-4.622f)
                lineToRelative(-0.721f, 6.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _hashtagLock!!
    }

private var _hashtagLock: ImageVector? = null
