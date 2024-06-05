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

public val Icons.Outline.VideoPlus: ImageVector
    get() {
        if (_videoPlus != null) {
            return _videoPlus!!
        }
        _videoPlus = Builder(name = "VideoPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.086f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineToRelative(-1.086f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(-4.086f)
                lineToRelative(4.0f, 4.0f)
                lineTo(24.0f, 4.086f)
                close()
                moveTo(18.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(22.0f, 15.086f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.172f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(6.172f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _videoPlus!!
    }

private var _videoPlus: ImageVector? = null
