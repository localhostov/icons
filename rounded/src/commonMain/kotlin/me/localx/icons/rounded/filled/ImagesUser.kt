package me.localx.icons.rounded.filled

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

public val Icons.Filled.ImagesUser: ImageVector
    get() {
        if (_imagesUser != null) {
            return _imagesUser!!
        }
        _imagesUser = Builder(name = "ImagesUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 16.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.414f, -1.721f, 4.435f, -4.0f, 4.899f)
                verticalLineToRelative(-1.399f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(1.399f)
                curveToRelative(-2.279f, -0.465f, -4.0f, -2.485f, -4.0f, -4.899f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(17.0f, 7.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -3.134f, -7.0f, -7.0f)
                verticalLineToRelative(-1.992f)
                lineToRelative(0.021f, -2.67f)
                curveToRelative(0.003f, -0.416f, -0.251f, -0.79f, -0.639f, -0.94f)
                curveToRelative(-0.386f, -0.15f, -0.828f, -0.045f, -1.105f, 0.265f)
                curveToRelative(-0.823f, 0.919f, -1.276f, 2.104f, -1.276f, 3.338f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _imagesUser!!
    }

private var _imagesUser: ImageVector? = null
