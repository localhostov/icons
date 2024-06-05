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

public val Icons.Outline.KipSign: ImageVector
    get() {
        if (_kipSign != null) {
            return _kipSign!!
        }
        _kipSign = Builder(name = "KipSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(8.94f)
                lineToRelative(10.67f, 8.21f)
                curveToRelative(0.44f, 0.34f, 0.52f, 0.96f, 0.18f, 1.4f)
                curveToRelative(-0.2f, 0.26f, -0.49f, 0.39f, -0.79f, 0.39f)
                curveToRelative(-0.21f, 0.0f, -0.43f, -0.07f, -0.61f, -0.21f)
                lineTo(7.0f, 15.03f)
                verticalLineToRelative(7.97f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.72f)
                lineTo(18.32f, 0.27f)
                curveToRelative(0.41f, -0.38f, 1.04f, -0.35f, 1.41f, 0.06f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.06f, 1.41f)
                lineTo(8.56f, 12.0f)
                horizontalLineToRelative(12.44f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _kipSign!!
    }

private var _kipSign: ImageVector? = null
