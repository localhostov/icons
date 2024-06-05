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

public val Icons.Filled.Party: ImageVector
    get() {
        if (_party != null) {
            return _party!!
        }
        _party = Builder(name = "Party", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 4.056f)
                arcToRelative(9.948f, 9.948f, 0.0f, false, true, 2.0f, 0.405f)
                verticalLineToRelative(4.69f)
                curveTo(14.017f, 9.053f, 13.008f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(-2.017f, 0.053f, -3.0f, 0.151f)
                lineTo(9.0f, 4.461f)
                arcToRelative(9.948f, 9.948f, 0.0f, false, true, 2.0f, -0.405f)
                lineTo(11.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                close()
                moveTo(2.0f, 14.0f)
                curveToRelative(0.0f, 0.82f, 1.879f, 1.927f, 5.0f, 2.541f)
                lineTo(7.0f, 11.459f)
                curveTo(3.879f, 12.073f, 2.0f, 13.18f, 2.0f, 14.0f)
                close()
                moveTo(17.0f, 5.353f)
                lineTo(17.0f, 9.425f)
                arcToRelative(15.949f, 15.949f, 0.0f, false, true, 4.473f, 1.4f)
                arcTo(10.033f, 10.033f, 0.0f, false, false, 17.0f, 5.353f)
                close()
                moveTo(9.0f, 11.16f)
                verticalLineToRelative(5.68f)
                arcTo(27.78f, 27.78f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(27.78f, 27.78f, 0.0f, false, false, 3.0f, -0.16f)
                lineTo(15.0f, 11.16f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -6.0f, 0.0f)
                close()
                moveTo(17.0f, 11.46f)
                verticalLineToRelative(5.082f)
                curveToRelative(3.121f, -0.614f, 5.0f, -1.721f, 5.0f, -2.541f)
                reflectiveCurveTo(20.121f, 12.073f, 17.0f, 11.459f)
                close()
                moveTo(9.0f, 18.85f)
                verticalLineToRelative(4.69f)
                arcToRelative(9.992f, 9.992f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-4.69f)
                curveToRelative(-0.983f, 0.1f, -1.992f, 0.151f, -3.0f, 0.151f)
                reflectiveCurveTo(9.983f, 18.947f, 9.0f, 18.849f)
                close()
                moveTo(17.0f, 22.65f)
                arcToRelative(10.033f, 10.033f, 0.0f, false, false, 4.473f, -5.468f)
                arcTo(15.949f, 15.949f, 0.0f, false, true, 17.0f, 18.575f)
                close()
                moveTo(7.0f, 22.65f)
                lineTo(7.0f, 18.575f)
                arcToRelative(15.949f, 15.949f, 0.0f, false, true, -4.473f, -1.4f)
                arcTo(10.033f, 10.033f, 0.0f, false, false, 7.0f, 22.647f)
                close()
                moveTo(2.527f, 10.821f)
                arcTo(15.949f, 15.949f, 0.0f, false, true, 7.0f, 9.425f)
                lineTo(7.0f, 5.353f)
                arcTo(10.033f, 10.033f, 0.0f, false, false, 2.527f, 10.821f)
                close()
            }
        }
        .build()
        return _party!!
    }

private var _party: ImageVector? = null
