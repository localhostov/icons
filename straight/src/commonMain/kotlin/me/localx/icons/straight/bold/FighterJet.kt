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

public val Icons.Bold.FighterJet: ImageVector
    get() {
        if (_fighterJet != null) {
            return _fighterJet!!
        }
        _fighterJet = Builder(name = "FighterJet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.376f, 8.078f)
                lineTo(12.277f, 3.0f)
                lineTo(14.0f, 3.0f)
                lineTo(14.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 8.0f)
                lineTo(4.621f, 8.0f)
                lineTo(3.5f, 6.879f)
                arcTo(3.02f, 3.02f, 0.0f, false, false, 1.379f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 18.0f)
                lineTo(1.379f, 18.0f)
                arcTo(3.02f, 3.02f, 0.0f, false, false, 3.5f, 17.121f)
                lineTo(4.621f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 21.0f)
                lineTo(12.283f, 21.0f)
                lineToRelative(3.093f, -5.052f)
                curveTo(21.1f, 15.492f, 24.0f, 14.165f, 24.0f, 12.0f)
                reflectiveCurveTo(21.1f, 8.514f, 15.376f, 8.078f)
                close()
                moveTo(14.405f, 13.009f)
                lineTo(13.627f, 13.059f)
                lineTo(10.0f, 18.983f)
                lineTo(10.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 5.027f)
                lineToRelative(3.628f, 5.945f)
                lineToRelative(0.783f, 0.047f)
                arcToRelative(25.79f, 25.79f, 0.0f, false, true, 5.9f, 0.983f)
                arcTo(25.794f, 25.794f, 0.0f, false, true, 14.405f, 13.009f)
                close()
            }
        }
        .build()
        return _fighterJet!!
    }

private var _fighterJet: ImageVector? = null
