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

public val Icons.Outline.SmokingBan: ImageVector
    get() {
        if (_smokingBan != null) {
            return _smokingBan!!
        }
        _smokingBan = Builder(name = "SmokingBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 2.398f, -0.85f, 4.6f, -2.262f, 6.324f)
                lineToRelative(-2.325f, -2.325f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.586f)
                lineToRelative(-7.738f, -7.738f)
                curveToRelative(1.725f, -1.412f, 3.927f, -2.262f, 6.324f, -2.262f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -2.398f, 0.85f, -4.6f, 2.262f, -6.324f)
                lineToRelative(14.062f, 14.062f)
                curveToRelative(-1.725f, 1.412f, -3.927f, 2.262f, -6.324f, 2.262f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                close()
                moveTo(11.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.1f, 0.262f, 0.463f, 1.062f, 0.691f)
                lineToRelative(2.423f, 0.692f)
                curveToRelative(1.551f, 0.444f, 2.514f, 1.446f, 2.514f, 2.616f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.1f, -0.262f, -0.464f, -1.064f, -0.692f)
                lineToRelative(-2.422f, -0.692f)
                curveToRelative(-1.55f, -0.442f, -2.514f, -1.444f, -2.514f, -2.615f)
                close()
                moveTo(7.758f, 12.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-5.758f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.758f)
                close()
            }
        }
        .build()
        return _smokingBan!!
    }

private var _smokingBan: ImageVector? = null
