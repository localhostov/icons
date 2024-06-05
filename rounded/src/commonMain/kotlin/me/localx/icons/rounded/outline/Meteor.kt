package me.localx.icons.rounded.outline

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

public val Icons.Outline.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 24.0f)
                arcToRelative(8.971f, 8.971f, 0.0f, false, true, -6.364f, -2.632f)
                horizontalLineToRelative(0.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 0.0f, -12.728f)
                curveTo(4.892f, 6.38f, 9.816f, 3.108f, 12.55f, 1.358f)
                arcTo(2.242f, 2.242f, 0.0f, false, true, 16.0f, 3.24f)
                lineToRelative(4.86f, -2.9f)
                arcToRelative(2.023f, 2.023f, 0.0f, false, true, 2.533f, 0.283f)
                arcToRelative(2.034f, 2.034f, 0.0f, false, true, 0.279f, 2.564f)
                lineTo(20.771f, 8.0f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, true, 1.871f, 3.449f)
                curveToRelative(-1.748f, 2.734f, -5.019f, 7.655f, -7.278f, 9.915f)
                arcTo(8.971f, 8.971f, 0.0f, false, true, 9.0f, 24.0f)
                close()
                moveTo(4.05f, 19.95f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, false, 9.9f, 0.0f)
                curveToRelative(2.125f, -2.126f, 5.3f, -6.914f, 7.007f, -9.579f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, false, 0.009f, -0.245f)
                arcTo(0.232f, 0.232f, 0.0f, false, false, 20.751f, 10.0f)
                lineTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.856f, -1.517f)
                lineToRelative(3.832f, -6.349f)
                lineToRelative(-0.028f, -0.111f)
                lineTo(15.512f, 5.859f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 5.0f)
                lineTo(14.0f, 3.249f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, false, -0.372f, -0.206f)
                curveTo(10.962f, 4.749f, 6.172f, 7.928f, 4.05f, 10.05f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, false, 0.0f, 9.9f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-5.275f, -0.138f, -5.273f, -7.863f, 0.0f, -8.0f)
                curveTo(14.275f, 11.138f, 14.273f, 18.863f, 9.0f, 19.0f)
                close()
                moveTo(9.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
