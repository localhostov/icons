package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.SmokingBan: ImageVector
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
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.586f)
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
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.65f, 0.453f, 1.249f, 1.183f, 1.562f)
                lineToRelative(2.422f, 1.038f)
                curveToRelative(1.455f, 0.623f, 2.395f, 1.958f, 2.395f, 3.4f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.651f, -0.453f, -1.25f, -1.183f, -1.562f)
                lineToRelative(-2.423f, -1.038f)
                curveToRelative(-1.455f, -0.623f, -2.395f, -1.958f, -2.395f, -3.399f)
                close()
                moveTo(12.758f, 16.0f)
                horizontalLineToRelative(-7.758f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.758f)
                lineToRelative(4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _smokingBan!!
    }

private var _smokingBan: ImageVector? = null
