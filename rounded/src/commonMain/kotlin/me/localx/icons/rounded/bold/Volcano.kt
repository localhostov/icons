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

public val Icons.Bold.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.75f)
                arcTo(3.256f, 3.256f, 0.0f, false, true, 4.86f, 2.523f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.175f, 1.18f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, true, 5.65f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.14f, 2.523f)
                arcTo(3.253f, 3.253f, 0.0f, false, true, 18.75f, 9.0f)
                lineTo(14.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                arcToRelative(1.564f, 1.564f, 0.0f, false, true, -1.825f, -0.874f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.585f, -0.364f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.408f, -0.6f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -1.864f, 0.0f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, -2.408f, 0.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.585f, 0.364f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.765f, 0.888f)
                arcTo(0.246f, 0.246f, 0.0f, true, false, 5.25f, 6.0f)
                lineTo(9.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                lineTo(5.25f, 9.0f)
                arcTo(3.254f, 3.254f, 0.0f, false, true, 2.0f, 5.75f)
                close()
                moveTo(23.691f, 21.958f)
                arcTo(3.487f, 3.487f, 0.0f, false, true, 20.473f, 24.0f)
                lineTo(3.527f, 24.0f)
                arcTo(3.487f, 3.487f, 0.0f, false, true, 0.309f, 21.958f)
                arcTo(3.355f, 3.355f, 0.0f, false, true, 0.84f, 18.329f)
                curveToRelative(0.028f, -0.032f, 7.116f, -6.906f, 7.116f, -6.906f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.044f, 0.423f)
                reflectiveCurveToRelative(7.088f, 6.874f, 7.116f, 6.906f)
                arcTo(3.355f, 3.355f, 0.0f, false, true, 23.691f, 21.958f)
                close()
                moveTo(15.983f, 15.542f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.01f, 0.0f, 0.0f)
                close()
                moveTo(8.014f, 15.542f)
                curveToRelative(0.0f, 0.007f, 0.0f, 0.007f, 0.0f, 0.0f)
                close()
                moveTo(20.925f, 20.33f)
                lineTo(16.0f, 15.559f)
                lineTo(16.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(13.0f, 15.9f)
                curveToRelative(-0.005f, -1.178f, -1.995f, -1.177f, -2.0f, 0.0f)
                verticalLineToRelative(0.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.941f)
                lineTo(3.075f, 20.333f)
                arcToRelative(0.351f, 0.351f, 0.0f, false, false, -0.037f, 0.379f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.527f, 21.0f)
                lineTo(20.473f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.489f, -0.288f)
                arcTo(0.351f, 0.351f, 0.0f, false, false, 20.925f, 20.333f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
