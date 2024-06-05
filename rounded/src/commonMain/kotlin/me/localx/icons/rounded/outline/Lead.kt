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

public val Icons.Outline.Lead: ImageVector
    get() {
        if (_lead != null) {
            return _lead!!
        }
        _lead = Builder(name = "Lead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(9.99f, 15.213f)
                curveToRelative(-0.078f, 0.547f, -0.583f, 0.923f, -1.132f, 0.849f)
                curveToRelative(-0.283f, -0.041f, -0.571f, -0.062f, -0.858f, -0.062f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.381f, 0.0f, 0.766f, 0.027f, 1.142f, 0.081f)
                curveToRelative(0.547f, 0.079f, 0.926f, 0.586f, 0.848f, 1.132f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 21.858f)
                verticalLineToRelative(-0.858f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(0.858f)
                curveToRelative(-1.399f, -0.364f, -2.494f, -1.459f, -2.858f, -2.858f)
                horizontalLineToRelative(0.858f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.858f)
                curveToRelative(0.364f, -1.399f, 1.459f, -2.494f, 2.858f, -2.858f)
                verticalLineToRelative(0.858f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-0.858f)
                curveToRelative(1.399f, 0.364f, 2.494f, 1.459f, 2.858f, 2.858f)
                horizontalLineToRelative(-0.858f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.858f)
                curveToRelative(-0.364f, 1.399f, -1.459f, 2.494f, -2.858f, 2.858f)
                close()
            }
        }
        .build()
        return _lead!!
    }

private var _lead: ImageVector? = null
