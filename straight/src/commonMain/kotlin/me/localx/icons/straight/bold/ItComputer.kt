package me.localx.icons.straight.bold

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

public val Icons.Bold.ItComputer: ImageVector
    get() {
        if (_itComputer != null) {
            return _itComputer!!
        }
        _itComputer = Builder(name = "ItComputer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(3.308f)
                lineToRelative(0.923f, 1.0f)
                horizontalLineToRelative(5.538f)
                lineToRelative(0.923f, -1.0f)
                horizontalLineToRelative(3.308f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.054f, 7.701f)
                lineToRelative(1.522f, -0.879f)
                curveToRelative(-0.049f, -0.267f, -0.076f, -0.542f, -0.076f, -0.823f)
                reflectiveCurveToRelative(0.026f, -0.556f, 0.076f, -0.823f)
                lineToRelative(-1.522f, -0.879f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(1.524f, 0.88f)
                curveToRelative(0.416f, -0.356f, 0.897f, -0.637f, 1.422f, -0.824f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.757f)
                curveToRelative(0.526f, 0.186f, 1.007f, 0.468f, 1.422f, 0.824f)
                lineToRelative(1.524f, -0.88f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(-1.522f, 0.879f)
                curveToRelative(0.049f, 0.267f, 0.076f, 0.542f, 0.076f, 0.823f)
                reflectiveCurveToRelative(-0.026f, 0.556f, -0.076f, 0.823f)
                lineToRelative(1.522f, 0.879f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(-1.524f, -0.88f)
                curveToRelative(-0.416f, 0.356f, -0.897f, 0.637f, -1.422f, 0.824f)
                verticalLineToRelative(1.757f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(-0.526f, -0.186f, -1.007f, -0.468f, -1.422f, -0.824f)
                lineToRelative(-1.524f, 0.88f)
                lineToRelative(-1.5f, -2.598f)
                close()
                moveTo(10.5f, 6.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _itComputer!!
    }

private var _itComputer: ImageVector? = null
