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

public val Icons.Bold.Pills: ImageVector
    get() {
        if (_pills != null) {
            return _pills!!
        }
        _pills = Builder(name = "Pills", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 11.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.916f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 14.0f)
                curveToRelative(0.412f, 0.0f, 0.808f, 0.072f, 1.176f, 0.203f)
                lineToRelative(-4.472f, 4.472f)
                curveToRelative(-0.132f, -0.368f, -0.203f, -0.763f, -0.203f, -1.176f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(17.5f, 21.0f)
                curveToRelative(-0.412f, 0.0f, -0.808f, -0.072f, -1.176f, -0.203f)
                lineToRelative(4.472f, -4.472f)
                curveToRelative(0.132f, 0.368f, 0.203f, 0.763f, 0.203f, 1.176f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(10.0f, 9.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(3.0f, 13.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.487f, 0.0f, 0.958f, -0.098f, 1.399f, -0.29f)
                curveToRelative(0.76f, -0.333f, 1.644f, 0.015f, 1.975f, 0.773f)
                reflectiveCurveToRelative(-0.015f, 1.644f, -0.774f, 1.975f)
                curveToRelative(-0.822f, 0.359f, -1.697f, 0.542f, -2.601f, 0.542f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                lineTo(-0.001f, 6.5f)
                curveTo(0.0f, 2.916f, 2.916f, 0.0f, 6.5f, 0.0f)
                reflectiveCurveToRelative(6.5f, 2.916f, 6.5f, 6.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _pills!!
    }

private var _pills: ImageVector? = null
