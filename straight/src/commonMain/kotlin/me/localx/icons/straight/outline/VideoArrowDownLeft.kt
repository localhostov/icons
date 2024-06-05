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

public val Icons.Outline.VideoArrowDownLeft: ImageVector
    get() {
        if (_videoArrowDownLeft != null) {
            return _videoArrowDownLeft!!
        }
        _videoArrowDownLeft = Builder(name = "VideoArrowDownLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.707f, 8.707f)
                lineToRelative(-5.293f, 5.293f)
                horizontalLineToRelative(3.606f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 16.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(5.293f, -5.293f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(24.0f, 19.914f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(4.086f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.086f)
                lineToRelative(4.0f, -4.0f)
                verticalLineToRelative(15.828f)
                close()
                moveTo(18.0f, 7.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(22.0f, 8.914f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(2.172f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-6.172f)
                close()
            }
        }
        .build()
        return _videoArrowDownLeft!!
    }

private var _videoArrowDownLeft: ImageVector? = null
