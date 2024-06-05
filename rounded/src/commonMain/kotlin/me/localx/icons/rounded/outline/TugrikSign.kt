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

public val Icons.Outline.TugrikSign: ImageVector
    get() {
        if (_tugrikSign != null) {
            return _tugrikSign!!
        }
        _tugrikSign = Builder(name = "TugrikSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(7.08f)
                lineToRelative(5.66f, -2.02f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.08f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-6.34f, 2.26f)
                verticalLineToRelative(1.88f)
                lineToRelative(5.66f, -2.02f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.09f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.08f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-6.34f, 2.26f)
                verticalLineToRelative(7.8f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-7.08f)
                lineToRelative(-5.66f, 2.02f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0.0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.61f, -1.28f)
                lineToRelative(6.34f, -2.26f)
                verticalLineToRelative(-1.88f)
                lineToRelative(-5.66f, 2.02f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0.0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.61f, -1.28f)
                lineToRelative(6.34f, -2.26f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _tugrikSign!!
    }

private var _tugrikSign: ImageVector? = null
