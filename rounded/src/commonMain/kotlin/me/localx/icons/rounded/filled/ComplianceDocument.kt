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

public val Icons.Filled.ComplianceDocument: ImageVector
    get() {
        if (_complianceDocument != null) {
            return _complianceDocument!!
        }
        _complianceDocument = Builder(name = "ComplianceDocument", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 7.0f)
                lineTo(12.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(11.151f, 19.0f)
                horizontalLineToRelative(-6.151f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.034f)
                curveToRelative(0.166f, -1.278f, 0.939f, -2.393f, 2.069f, -3.0f)
                horizontalLineToRelative(-0.103f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(10.0f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                horizontalLineToRelative(-4.515f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(9.479f)
                curveToRelative(-1.391f, -1.122f, -2.86f, -2.783f, -3.327f, -5.0f)
                close()
                moveTo(19.083f, 23.858f)
                curveToRelative(1.153f, -0.464f, 4.917f, -2.292f, 4.917f, -6.322f)
                verticalLineToRelative(-4.017f)
                curveToRelative(0.0f, -0.862f, -0.551f, -1.625f, -1.37f, -1.896f)
                lineToRelative(-3.815f, -1.265f)
                curveToRelative(-0.203f, -0.068f, -0.426f, -0.068f, -0.629f, 0.0f)
                lineToRelative(-3.815f, 1.265f)
                curveToRelative(-0.819f, 0.271f, -1.37f, 1.034f, -1.37f, 1.896f)
                verticalLineToRelative(4.017f)
                curveToRelative(0.0f, 3.57f, 3.715f, 5.703f, 4.85f, 6.27f)
                curveToRelative(0.0f, 0.0f, 0.325f, 0.209f, 0.651f, 0.209f)
                reflectiveCurveToRelative(0.582f, -0.156f, 0.582f, -0.156f)
                close()
            }
        }
        .build()
        return _complianceDocument!!
    }

private var _complianceDocument: ImageVector? = null
