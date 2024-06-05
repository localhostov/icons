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

public val Icons.Outline.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) {
            return _conciergeBell!!
        }
        _conciergeBell = Builder(name = "ConciergeBell", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.343f)
                curveToRelative(1.465f, 0.0f, 2.657f, -1.192f, 2.657f, -2.657f)
                verticalLineToRelative(-0.343f)
                curveToRelative(0.0f, -3.029f, -1.268f, -5.955f, -3.479f, -8.027f)
                curveToRelative(-1.817f, -1.703f, -4.09f, -2.715f, -6.521f, -2.93f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.044f)
                curveTo(5.371f, 5.553f, 1.0f, 10.462f, 1.0f, 16.343f)
                curveToRelative(0.0f, 1.465f, 1.192f, 2.657f, 2.657f, 2.657f)
                horizontalLineToRelative(7.343f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(23.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(3.0f, 16.342f)
                curveToRelative(0.0f, -4.923f, 3.689f, -9.018f, 8.399f, -9.323f)
                curveToRelative(0.197f, -0.013f, 0.393f, -0.019f, 0.588f, -0.02f)
                horizontalLineToRelative(0.028f)
                curveToRelative(2.294f, 0.002f, 4.455f, 0.854f, 6.138f, 2.432f)
                curveToRelative(1.836f, 1.721f, 2.847f, 4.053f, 2.847f, 6.568f)
                verticalLineToRelative(0.343f)
                curveToRelative(0.0f, 0.362f, -0.295f, 0.657f, -0.657f, 0.657f)
                horizontalLineTo(3.657f)
                curveToRelative(-0.362f, 0.0f, -0.657f, -0.295f, -0.657f, -0.658f)
                close()
            }
        }
        .build()
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
