package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.965f, 129.771f)
                lineToRelative(29.078f, 0.0f)
                lineToRelative(-14.486f, -38.358f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 0.0f)
                horizontalLineTo(96.0f)
                curveTo(43.005f, 0.059f, 0.059f, 43.005f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.059f, 52.995f, 43.005f, 95.941f, 96.0f, 96.0f)
                horizontalLineToRelative(255.659f)
                curveToRelative(25.476f, 0.078f, 49.923f, -10.048f, 67.883f, -28.117f)
                lineToRelative(64.341f, -64.32f)
                curveToRelative(18.059f, -17.966f, 28.184f, -42.409f, 28.117f, -67.883f)
                verticalLineTo(96.0f)
                curveTo(511.941f, 43.005f, 468.995f, 0.059f, 416.0f, 0.0f)
                close()
                moveTo(202.219f, 165.952f)
                curveToRelative(2.604f, 6.893f, -0.873f, 14.591f, -7.765f, 17.195f)
                curveToRelative(-6.893f, 2.604f, -14.591f, -0.873f, -17.195f, -7.765f)
                lineToRelative(-7.147f, -18.944f)
                horizontalLineToRelative(-49.301f)
                lineToRelative(-7.232f, 18.965f)
                curveToRelative(-2.801f, 6.81f, -10.593f, 10.06f, -17.403f, 7.258f)
                curveToRelative(-6.551f, -2.695f, -9.852f, -10.043f, -7.514f, -16.73f)
                lineToRelative(42.133f, -110.656f)
                curveToRelative(2.378f, -6.119f, 8.262f, -10.157f, 14.827f, -10.176f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(6.434f, 0.001f, 12.228f, 3.897f, 14.656f, 9.856f)
                lineTo(202.219f, 165.952f)
                close()
                moveTo(226.283f, 58.432f)
                curveToRelative(0.0f, -7.364f, 5.97f, -13.333f, 13.333f, -13.333f)
                curveToRelative(7.364f, 0.0f, 13.333f, 5.97f, 13.333f, 13.333f)
                verticalLineToRelative(112.235f)
                curveToRelative(0.0f, 7.364f, -5.97f, 13.333f, -13.333f, 13.333f)
                curveToRelative(-7.364f, 0.0f, -13.333f, -5.97f, -13.333f, -13.333f)
                verticalLineTo(58.432f)
                close()
                moveTo(362.667f, 320.0f)
                curveTo(339.103f, 320.0f, 320.0f, 339.103f, 320.0f, 362.667f)
                verticalLineTo(448.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, -14.327f, -32.0f, -32.0f)
                verticalLineTo(234.667f)
                horizontalLineToRelative(384.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(362.667f)
                close()
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
